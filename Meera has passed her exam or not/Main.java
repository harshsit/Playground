#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,i,flag;
  cin>>n;
  int arr[n];
  for(i=0;i<n;i++)
  {
     cin>>arr[i];
  }
  int a;
  cin>>a;
  for(i=0;i<n;i++)
  {
    if(a==arr[i])
    {
      flag=1;
      break;
    
    
  }
  }
    if(flag==1)
    {
  cout<<"She passed her exam";}
    else
    {
      cout<<"She failed";
    }
}