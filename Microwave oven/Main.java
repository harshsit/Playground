#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  float t;
  cin>>n>>t;
  if(n==2){
  
    t=t+(0.5*t);
    cout<<t;
    
  }
  else if(n==3)
  {
     t=2*t;
    cout<<t;
  }
  else if(n>3)
  {
    cout<<"Number of items is more";
  }
}