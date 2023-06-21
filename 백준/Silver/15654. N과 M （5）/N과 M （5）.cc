#include <bits/stdc++.h>
using namespace std;
int n, m;
int arr[10];
int save[10];
int isused[10];

void func(int k) {
    if (k == m) {
        for (int i = 0; i < m; i++)
            cout << save[i] << ' ';
        cout << '\n';
        return;
    }
    for (int i = 0; i < n; i++) {
        if (!isused[i]) {
            save[k] = arr[i];
            isused[i] = 1;
            func(k + 1);
            isused[i] = 0;
        }
    }
}

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cin >> n >> m;
    for (int i = 0; i < n; i++)
        cin >> arr[i];

    sort(arr, arr+n);
    func(0);
}
