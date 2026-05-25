#include<stdio.h>
#define max 5
int queue[max];
int rear=-1;
int front = -1;
void enqueue(int data){
    if(rear==max-1){
        printf("queue is full \n");
        return;
    }
    if(front==-1){
        front=0;
    }
    queue[++rear] = data;
}
void dequeue(){
    if(front==-1||front>rear){
        printf("the queue is empty \n");
        return;
    }
    if(front>rear){
        front=rear=-1;
    }
    printf("the element dequed is : %d\n",queue[front++]);
}
void isfull(){
    if(rear==max-1){
        printf("queue is full \n");
        return;
    }
    printf("the queue is not full\n");
}
void isempty(){
    if(front==-1||front>rear){
        printf("the queue is empty \n");
        return;
    }
    printf("the queue is not empty\n");
}
void display(){
    if(front==-1||front>rear){
        printf("the queue is empty cant display \n");
        return;
    }
    for(int i=front;i<=rear;i++){
        printf("the element at index %d is: %d\n",i,queue[i]);
    }
}
