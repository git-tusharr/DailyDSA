#include <iostream>
using namespace std;

// Recursive function
int LinearSearch(int arr[], int n, int index, int key) {
    // Base case
    if (index == n) {
        return -1;
    }

    // If element found
    if (arr[index] == key) {
        return index;
    }

    // Recursive call
    return LinearSearch(arr, n, index + 1, key);
}

int main() {
    int n;

    cout << "Enter number of elements: ";
    cin >> n;

    int* arr = new int[n];  // dynamic array

    cout << "Enter elements:\n";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    int target;
    cout << "Enter element to search: ";
    cin >> target;

    int result = LinearSearch(arr, n, 0, target);

    if (result == -1) {
        cout << "Element not found";
    } else {
        cout << "Element found at index: " << result;
    }

    delete[] arr; // free memory
    return 0;
}