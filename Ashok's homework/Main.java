#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  int r,i,j;
  cin>>r;
  int c;
  cin>>c;
  int arr1[r][c],arr2[r][c],sum[r][c];
  for(i=0;i<r;i++)
  {
     for(j=0;j<c;j++)
     {
         cin>>arr1[i][j];
     }
  }
  for(i=0;i<r;i++)
  {
     for(j=0;j<c;j++)
     {
         cin>>arr2[i][j];
     }
  }
  for(i=0;i<r;i++)
  {
     for(j=0;j<c;j++)
     {
         sum[i][j]=arr1[i][j]+arr2[i][j];
       cout<<sum[i][j]<<" ";
     }
    cout<<"\n";
  }
  
  
  
  
  
}