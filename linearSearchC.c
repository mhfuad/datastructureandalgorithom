#include <stdio.h>
void main(){
    int arr[5] = {12,3,5,6,6};
    int x = linearsearch(arr,5,6);
    printf(x);
}

int function linearsearch(int A[], int n, int x){

	for(int i 0; i < n; i++){
        if(A[i] == x){
            return i;
        }
	}
	i = -1;
	return i;
}
