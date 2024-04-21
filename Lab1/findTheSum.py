def find_the_sum(arr, target):
    for i in range(len(arr)):
        for j in range(i + 1, len(arr)):
            if arr[i] + arr[j] == target:
                return [i, j]
    return [-1]

def main():
    arr = [1, 2, 3, 8, 9]
    print(find_the_sum(arr, 17))

if __name__ == "__main__":
    main()