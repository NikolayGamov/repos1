/*
	В основу решения задачи было положено замеченное свойство:
	при обходе матрицы по спирали в каждом направлении необходимо проходить n шагов,
	начиная с n = 1 и увеличивать n на 1 каждые 2 смены направления
*/


#include <iostream>
#include <vector>


using namespace std;


// контейнер накопления результата для вывода
using Result = vector<int>;


// структура, позволяющая держать 2 координаты ячейки матрицы
struct cell
{
	int x;
	int y;
};


// сдвиг текущей клетки (center - ссылка на текущую точку, dir - направление обхода)
// enum Directions не был введён из-за объемности реализации смены направления в 
// определенной последовательности
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


// смена направления движения по матрице (dir - текущее нарпвление)
void dirCh(int& dir)
{
	dir < 4 ? ++dir : dir = 1;
}


// движение в одном нарпалении до его смены
// params: matrix - ссылка на матрицу
//		   center - ссылка на начальный узел для данного отрезка движения
//		   res    - ссылка на результат
//		   steps  - ссылка на количество шагов в данном направлении
//		   dir    - ссылка на текущее направление
//         filledCells - ссылка на количество пройденных клеток
void SpiralStep(int ** matrix, cell& center, Result & res, int & steps, int & dir, int & filledCells)
{
	int count = 0;

	// считывание значений из клеток в текущем направлении
	while (count < steps)
	{
		res.push_back(matrix[center.x][center.y]);
		moveCell(center, dir);

		++count;
		++filledCells;
	}

	// увеличение числа шагов на 1 каждые 2 смены направления
	if (dir % 2 == 0)
		steps++;

	dirCh(dir);
}


void main()
{
	// ввод длины ребра матрицы
	int matrixSize;
	cout << "Please, enter odd number - matrix size:" << endl;
	cin >> matrixSize;

	// проверка на нечетность
	if (matrixSize % 2 == 0)
	{
		cout << matrixSize << " is an even number" << endl;
		return;
	}

	// инициализация матрицы и ввод значений
	int** matrix = new int*[matrixSize];

	for (int i = 0; i < matrixSize; ++i)
	{
		matrix[i] = new int[matrixSize];

		for (int j = 0; j < matrixSize; ++j)
		{
			cin >> matrix[i][j];
		}
	}


	// инициализация контейнера для формирования результата
	Result result = {};

	cell center = { (int)(matrixSize / 2),   // начальная точка матрицы
					(int)(matrixSize / 2) }; // для обхода


	int dir = 1;                             // направление движения по матрице
	int cellsfilled = 0;					 // количество пройденных клеток
	int steps = 1;							 // начальное количество шагов в одном нарпавлении

	
	// формирование результата
	while(cellsfilled < matrixSize * matrixSize)
		SpiralStep(matrix, center, result, steps, dir, cellsfilled);


	// освобождение выделенной под матрицу памяти
	for (int i = 0; i < matrixSize; ++i)
	{
		delete[] matrix[i];
	}
	delete[] matrix;


	// вывод сформированного вектора
	for (auto&& cell : result)
		cout << cell << " ";
}