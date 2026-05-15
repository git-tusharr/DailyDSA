#include <bits/stdc++.h>
using namespace std;

int longestSubarray(vector<int>& arr, int k) {
    unordered_map<int, int> prefixMap;
    
    int sum = 0;
    int maxLen = 0;

    for (int i = 0; i < arr.size(); i++) {
        sum += arr[i];

        // If sum itself equals k
        if (sum == k) {
            maxLen = i + 1;
        }

       
        if (prefixMap.find(sum - k) != prefixMap.end()) {
            maxLen = max(maxLen, i - prefixMap[sum - k]);
        }

        // Store first occurrence of prefix sum
        if (prefixMap.find(sum) == prefixMap.end()) {
            prefixMap[sum] = i;
        }
    }

    return maxLen;
}

int main() {
    int n;
    cin >> n;

    vector<int> arr(n);

    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    int k;
    cin >> k;

    cout << longestSubarray(arr, k);

    return 0;
}