#include<iostream>
using namespace std;
int power(int a,int n)
{
  if(n==0)
    return 1;
  else{
    return a*power(a,n-1);
}
}

int main()
{
  //Type your code here.
  int a;
  cout<<"Enter the value of a"<<endl;
  cin>>a;
  int n;
  cout<<"Enter the value of n"<<endl;
  cin>>n;
  cout<<"The value of "<<a<<" "<<"power "<<n<<" "<<"is"<<" "<<power(a,n);
}