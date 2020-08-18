#include<iostream>
using namespace std;
int main()
{
    // Type your code here
   int r,i,j;
  cin>>r;
  int c;
  cin>>c;
  int arr[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
       cin>>arr[i][j];
    }
  }
  for(i=0;i<c;i++)
  {
    for(j=0;j<r;j++)
    {
      cout<<arr[j][i]<<" ";
      
      
       }
    cout<<"\n";
    
    
  }
  
  
}