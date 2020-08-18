#include<iostream>
using namespace std;

int exp(int,int);
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  if(exp(a,b)>=c)
  {
    cout<<"Doctor, you can proceed with your experiment.";
     
  }
  else{
    cout<<"Sorry Doctor! You need more bacteria.";
  
  }
}
  int exp(int a,int b)
  {
    int m=1;
     int i;
    while(b!=0)
    {
      m=m*a;
      --b;
    
    }
    return m;
  
  }
  
