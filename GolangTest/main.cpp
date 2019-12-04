/*
	� ������ ������� ������ ���� �������� ���������� ��������:
	��� ������ ������� �� ������� � ������ ����������� ���������� ��������� n �����,
	������� � n = 1 � ����������� n �� 1 ������ 2 ����� �����������
*/


#include <iostream>
#include <vector>


using namespace std;


// ��������� ���������� ���������� ��� ������
using Result = vector<int>;


// ���������, ����������� ������� 2 ���������� ������ �������
struct cell
{
	int x;
	int y;
};


// ����� ������� ������ (center - ������ �� ������� �����, dir - ����������� ������)
// enum Directions �� ��� ����� ��-�� ���������� ���������� ����� ����������� � 
// ������������ ������������������
void moveCell(cell& center, int dir)
{
	switch (dir)
	{
	case 1:
	{
		--center.y;
		break;
	}
	case 2:
	{
		++center.x;
		break;
	}
	case 3:
	{
		++center.y;
		break;
	}
	case 4:
	{
		--center.x;
		break;
	}
	default:
		break;
	}
}


// ����� ����������� �������� �� ������� (dir - ������� ����������)
void dirCh(int& dir)
{
	dir < 4 ? ++dir : dir = 1;
}


// �������� � ����� ���������� �� ��� �����
// params: matrix - ������ �� �������
//		   center - ������ �� ��������� ���� ��� ������� ������� ��������
//		   res    - ������ �� ���������
//		   steps  - ������ �� ���������� ����� � ������ �����������
//		   dir    - ������ �� ������� �����������
//         filledCells - ������ �� ���������� ���������� ������
void SpiralStep(int ** matrix, cell& center, Result & res, int & steps, int & dir, int & filledCells)
{
	int count = 0;

	// ���������� �������� �� ������ � ������� �����������
	while (count < steps)
	{
		res.push_back(matrix[center.x][center.y]);
		moveCell(center, dir);

		++count;
		++filledCells;
	}

	// ���������� ����� ����� �� 1 ������ 2 ����� �����������
	if (dir % 2 == 0)
		steps++;

	dirCh(dir);
}


void main()
{
	// ���� ����� ����� �������
	int matrixSize;
	cout << "Please, enter odd number - matrix size:" << endl;
	cin >> matrixSize;

	// �������� �� ����������
	if (matrixSize % 2 == 0)
	{
		cout << matrixSize << " is an even number" << endl;
		return;
	}

	// ������������� ������� � ���� ��������
	int** matrix = new int*[matrixSize];

	for (int i = 0; i < matrixSize; ++i)
	{
		matrix[i] = new int[matrixSize];

		for (int j = 0; j < matrixSize; ++j)
		{
			cin >> matrix[i][j];
		}
	}


	// ������������� ���������� ��� ������������ ����������
	Result result = {};

	cell center = { (int)(matrixSize / 2),   // ��������� ����� �������
					(int)(matrixSize / 2) }; // ��� ������


	int dir = 1;                             // ����������� �������� �� �������
	int cellsfilled = 0;					 // ���������� ���������� ������
	int steps = 1;							 // ��������� ���������� ����� � ����� �����������

	
	// ������������ ����������
	while(cellsfilled < matrixSize * matrixSize)
		SpiralStep(matrix, center, result, steps, dir, cellsfilled);


	// ������������ ���������� ��� ������� ������
	for (int i = 0; i < matrixSize; ++i)
	{
		delete[] matrix[i];
	}
	delete[] matrix;


	// ����� ��������������� �������
	for (auto&& cell : result)
		cout << cell << " ";
}