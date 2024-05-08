ef coin_change(coins, amount):
    if amount == 0:
        return 0

    r = float('inf')
    l = len(coins)
    for i in range(l):
        if coins[i] <= amount:
            sub_res = coin_change(coins, amount - coins[i])
            if sub_res != float('inf') and sub_res + 1 < r:
                r = sub_res + 1

    if r == float('inf') or r == 0:
        return -1

    return r

if __name__ == "__main__":
    coins = [4, 2, 9]
    amount = 30
    print("Minimum coins required is", coin_change(coins, amount))