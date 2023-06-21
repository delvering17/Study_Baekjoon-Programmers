#include <bits/stdc++.h>
using namespace std;
int n, m;
int arr[10];
bool isused[10][10];

void func(int k, int num) {
    if (k == m) {
        for (int i = 0; i < m; i++)
            cout << arr[i] << ' ';
        cout << '\n';
        return;
    }

    for (int i = num; i <= n; i++) {
        arr[k] = i;
        func(k + 1, i);
    }
}

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cin >> n >> m;
    func(0, 1);
}
