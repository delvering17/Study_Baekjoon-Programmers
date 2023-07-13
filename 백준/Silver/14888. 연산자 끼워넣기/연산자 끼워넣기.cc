#include <bits/stdc++.h>
using namespace std;
int n;
int num[14];
int op[14];
bool check[14];
int save[14];
int mx = INT_MIN, mn = INT_MAX, cur;

int calculator(int oper, int num1, int num2) {
    switch(oper) {
        case 1: return num1 + num2;
        case 2: return num1 - num2;
        case 3: return num1 * num2;
        case 4: return num1 / num2;
    }
}

void func(int k) {
    if (k == n-1) {
        int sum = calculator(save[0], num[0], num[1]);
        for (int i = 1; i < n-1; i++)
            sum = calculator(save[i], sum, num[i+1]);
        if (mx < sum) mx = sum;
        if (mn > sum) mn = sum;
        return;
    }
    for (int i = 0; i < n-1; i++) {
        if (check[i]) continue;
        check[i] = 1;
        save[k] = op[i];
        func(k+1);
        check[i] = 0;
    }
}

int main(void) {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cin >> n;
    for (int i = 0; i < n; i++)
        cin >> num[i];
    int j = 0;
    for (int i = 1 ; i <= 4; i++) {
        int q;
        cin >> q;
        while(q--) op[j++] = i;
    }
    func(0);
    cout << mx << '\n' << mn;
}