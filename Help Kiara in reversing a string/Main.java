#include<iostream>

#include<string.h>

using namespace std;

int main ()

{

char str[50], temp;

int i, j;

gets(str);
int k = 0; 
    while (str[k]) 
        k++; 
  j=k-1;
  for (i = 0; i < j; i++,j--)

{temp = str[i];
 str[i] = str[j];

str[j] = temp;

}

cout << str;

return 0;

}
