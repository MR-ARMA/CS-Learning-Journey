#include <iostream>


using namespace std;

void print(int fr,int to){
	cout << "from: " << fr << " to: " << to << '\n';
}

// Function to solve the Tower of Hanoi problem using recursion
void town(int n=3, int fr=0, int to=1, int spare=2){
	if(n==1){
		print(fr, to);
	}else{
		town(n-1, fr, spare, to);
		town(1, fr, to, spare);
		town(n-1, spare, to, fr);
	}
}

int main() {
 int n;
 cout << "Enter the number of disks: ";
 cin >> n;
 town(n);
 return 0;
}
