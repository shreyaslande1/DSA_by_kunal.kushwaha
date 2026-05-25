#include<stdio.h>
#define max 5
int stack[max];
int top =-1;
void push(int data){
    if(top==max-1){
        printf("stack is overflow\n");
        return;
    }
    stack[++top]=data;
}
void pop(){
    if(top==-1){
        printf("stack is underflow \n");
        return;
    }
    printf("element popped is: %d\n",stack[top--]);
}
void peek(){
    if(top==-1){
        printf("stack is underflow \n");
        return;
    }
    printf("the peek element is: %d\n", stack[top]);
}
void display(){
    if(top==-1){
        printf("stack is underflow \n");
        return;
    }
    for(int i = top;i>=0;i--){
        printf("the element at %d index is %d\n",i,stack[i]);
    }
}
int main(){
    push(1);
    push(5);
    push(3);
    push(2);
    push(9);
    push(9);
    push(9);
    display();
    pop();
    peek();
    pop();
    peek();
}