#include <iostream>
#include <cctype>
#include <string>

using namespace std;

// Function to convert a string to lowercase and remove non-alphabet characters
string toChars(string s) {
   string ans = "";
   for (char c : s) {
       if (isalpha(c)) {
           ans += tolower(c);
       }
   }
   return ans;
}

// Function to check if a string is a palindrome
bool isPal(string s) {
   if (s.length() <= 1) {
       return true;
   } else {
       return s[0] == s[s.length() - 1] && isPal(s.substr(1, s.length() - 2));
   }
}

// Function to check if a string is a palindrome, ignoring case and non-alphabet characters
bool isPalindrome(string s) {
   return isPal(toChars(s));
}

int main() {
   string s = "A man, a plan, a canal: Panama";
   if (isPalindrome(s)) {
       cout << "The string is a palindrome." << endl;
   } else {
       cout << "The string is not a palindrome." << endl;
   }
   return 0;
}
