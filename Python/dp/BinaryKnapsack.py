'''
date 04/04/2019
@author T Vasu Babu

References : https://www.youtube.com/watch?v=8LusJS5-AGo&list=PLrmLmBdmIlpsHaNTPP_jHHDx_os9ItYXr
'''

def BinaryKnapsack(wt, val):
    # Assuming both wt and val contains sane values
    len1 = len(wt)
    arr = [0]*len1
    return arr


def main():
    wt = [1,3,4,5]
    val = [1,4,5,7]
    ret = BinaryKnapsack(wt, val)
    print (ret)

if __name__ == '__main__':
    main()