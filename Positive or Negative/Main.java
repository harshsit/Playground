#include<iostream>
using namespace std;
int main()
{
  int a;
  cin>>a;
  int b=abs(a);
  if(a==b)
  {
    cout<<a<<" "<<"is a positive number.";
  }
  else{
    cout<<a<<" "<<"is a negative number."; 
  }
}