#include<iostream>
#include<vector>
using namespace std;

int main()
{
    vector<vector<int>> matrix;
    vector<int> vec;
    int sum = 0, temp = 0;
    
    int m, n;
    cin >> m;
    cin >> n;
    
    for (int j = 0; j < m; j++)
    {
        vec.clear();
        for (int i = 0; i < n; i++)
        {
            cin >> temp;
            vec.push_back(temp);
        }
        matrix.push_back(vec);
    }
    
    //for (int j = 0; j < m; j++)
    //{
    //    for (int i = 0; i < n; i++)
    //    {
    //        cout << matrix[j][i];
    //    }
    //}
    
    int x = 0, y = 0;
    int nextx, nexty;
    while (x != m - 1 || y != n - 1)
    {
        cout << "(" << x << "," << y << ")" << endl;
        sum += matrix[x][y];
        if (x != m - 1)  nextx = x + 1;
        
        if (y != n - 1)  nexty = y + 1;
        
        if (x == m - 1)
        {
            y++;
        }
        else if (y == n - 1)
        {
            x++;
        }
        else if (matrix[nextx][y] <= matrix[x][nexty])
        {
            //cout << "matrix[" << nextx << "][" << y << "] = " << matrix[nextx][y] << ", matrix[" << x << "][" << nexty << "] = " << matrix[x][nexty] << endl;
            x = nextx;
        }
        else
        {
            //cout << "matrix[" << nextx << "][" << y << "] = " << matrix[nextx][y] << ", matrix[" << x << "][" << nexty << "] = " << matrix[x][nexty] << endl;
            y = nexty;
        }
    }
    
    cout << "(" << x << "," << y << ")" << endl;
    sum += matrix[x][y];
    cout << sum << endl;
    
    getchar();
    getchar();
    return 0;
}




