#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,count=0;
  float a=0.0;
  do{
    
    cin>>n;
    if(n%2==1&&n>0){
      a=a+1;
      count=count+1;
      
    }
    else if(n%2==0&&n>0)
    {
      a=a-0.5;
    }
    else if(n<0)
    {
    
      a=a-1;
    }
  
  
  }while(n>0&&count!=3);
  
  cout<<a;
  
}