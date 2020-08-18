#include<iostream>
using namespace std;

int main()
{
  // Type your code here
  int n,i;
  cin>>n;
  int arr[n];
  for(i=0;i<n;i++)
  {
    cin>>arr[i];
    
  }
  int value=arr[0];
 
  for(i=1;i<n;i++)
  {
    if(value<arr[i])
       value=arr[i];
    
  }
  cout<<value;
}