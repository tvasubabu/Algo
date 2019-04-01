'''

Given a matrix of m * n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example:

Given the following matrix:

[
    [ 1, 2, 3 ],
    [ 4, 5, 6 ],
    [ 7, 8, 9 ]
]
You should return

[1, 2, 3, 6, 9, 8, 7, 4, 5]

'''


def spiralOrder(A):
    rows = len(A)
    cols = len(A[0])
    left = 0
    top = 0
    right = cols - 1
    bottom = rows - 1
    flag = 0
    arr = []

    while left <= right and top <= bottom:
        if flag == 0:
            # Process the Topmost Row, left->right
            j = left
            while j <= right:
                arr.append(A[top][j])
                j = j + 1
            # Update the top
            top = top + 1
        elif flag == 1:
            # Process the Right most column, top->bottom
            i = top
            while i <= bottom:
                arr.append(A[i][right])
                i = i + 1
            # Update the right
            right = right - 1
        elif flag == 2:
            # Process the Bottom most row, right->left
            j = right
            while j >= left:
                arr.append(A[bottom][j])
                j = j - 1
            # Update the bottom
            bottom = bottom - 1
        else:
            # Process the left most column, bottom->top
            i = bottom
            while i >= top:
                arr.append(A[i][left])
                i = i - 1
            # Update the left
            left = left + 1
        # Update the flag for next iteration
        flag = (flag + 1) % 4
    return arr

def main():
    arr = spiralOrder([[1,2,3],[4,5,6],[7,8,9]])
    print (arr)

if __name__ == '__main__':
    main()