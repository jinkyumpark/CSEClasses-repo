//Find prime number for specified range by creating given number of processes and distribute them evenly

#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
#include <stdlib.h>

int isPrimeNumber(int n);
//implement: return 1 when child process succeed its operations
//implement: parent process add return value of child processes and print it
int main(int argc, char* argv[]){

    int primeTill = atoi(argv[1]);
    int processNum = atoi(argv[2]);

    int processArray[processNum];
    int numPerProcess = primeTill / processNum;

    for(int i=0; i < processNum; i++){
        processArray[i] = fork();
        if(processArray[i] == 0){
            int initialNum = numPerProcess * i + 1;
            //int finalNum = numPerProcess * (i + 1);
            int finalNum = primeTill - numPerProcess *(processNum - i - 1);
            int countPrime = 0;

            for(int x = initialNum; x <= finalNum; x++){
                if(isPrimeNumber(x) == 1){
                    countPrime++;
                }
            }
            printf("Process %d has found %d prime numbers in (%d~%d).\n", 
            	getpid(), countPrime, initialNum, finalNum);

            exit(0);
        }
    }
    for(int i = 0; i < processNum; i++){
        wait(NULL);
    }
}

int isPrimeNumber(int n){
    int i = 0;
    int last  = n/2;
    if(n <= 1){
        return 0;
    }
    for(i = 2; i <= last; i++) {
        if ((n % i) == 0) {
            return 0;
        }
    }
    return 1;
}
