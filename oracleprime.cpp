#include <bits/stdc++.h>
using namespace std;
int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    const int MAXN = 120000;
    vector<bool> isprime(MAXN + 1, true);
    isprime[0] = isprime[1] = false;
    for (int i = 2; i * i <= MAXN; i++) {
        if (isprime[i]) {
            for (int j = i * i; j <= MAXN; j += i)
                isprime[j] = false;
        }
    }
    vector<int> nextprime(MAXN + 2, 0);
    for (int i = MAXN; i >= 0; i--) {
        if (isprime[i])
            nextprime[i] = i;
        else
            nextprime[i] = nextprime[i + 1];
    }
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        cout << nextprime[n] << "\n";
    }
    return 0;
}
