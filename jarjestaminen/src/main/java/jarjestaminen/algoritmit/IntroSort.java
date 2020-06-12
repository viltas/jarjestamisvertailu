package jarjestaminen.algoritmit;

public class IntroSort {

    private int[] arr;
    private int size;

    public IntroSort(int[] arr) {

        this.arr = arr;
        this.size = arr.length;

    }

    public int[] getArr() {
        return this.arr;
    }

}

/*

procedure sort(A : array):
    let maxdepth = ⌊log(length(A))⌋ × 2
    introsort(A, maxdepth)

procedure introsort(A, maxdepth):
    n ← length(A)
    if n ≤ 1:
        return  // base case
    else if maxdepth = 0:
        heapsort(A)
    else:
        p ← partition(A)  // assume this function does pivot selection, p is the final position of the pivot
        introsort(A[0:p-1], maxdepth - 1)
        introsort(A[p+1:n], maxdepth - 1)

 */
