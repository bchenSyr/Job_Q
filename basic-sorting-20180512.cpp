//  practice bubble, selection and insertion sort using stl list and vector
//
//  Created by bchen95 on 5/12/18.
//  Copyright © 2018 bchen95. All rights reserved.
//

#include <iostream>
#include <vector>
#include <list>

template<typename T>
void Print(T &vec) {
    auto iter = vec.begin();
    while(iter != vec.end()) {
        std::cout << (*iter)<< " ";
        iter++;
    }
    std::cout << std::endl;
}

void BubbleSort(std::vector<int> &vec) {
    int temp;
    for(size_t j = vec.size() - 1; j  > 0; j--) {
        for(int i = 0; i < j; i++) {
            if(vec[i] > vec[i+1]) {
                temp = vec[i];
                vec[i] = vec[i + 1];
                vec[i + 1] = temp;
            }
        }
    }
}

void SelectionSort(std::vector<int> &vec) {
    
    int temp, index;
    
    for(int i = 0; i < vec.size(); i++) {
        temp = vec[i];
        index = i;
        
        for(int j = i; j < vec.size(); j++) {
            if(vec[j] < temp) {
                temp = vec[j];
                index = j;
            }
        }
        
        temp = vec[i];
        vec[i] = vec[index];
        vec[index] = temp;
    }
}

void InsertionSort(std::list<int> &list) {
   
    auto iter1 = list.begin();
    while(iter1 != list.end()) {
        int temp = (*iter1);
        auto iter2 = list.begin();

        while(iter2 != iter1) {
            if(temp <= (*iter2)) {
                break;
            }
            iter2++;
        }
        
        if(iter2 != iter1) {
            list.insert(iter2, temp); // insert a node in front of position pointed by iter2
            list.erase(iter1);
           //delete iter1;
        }
        iter1++;
    }
}

int main(int argc, const char * argv[]) {
    
     /* BubbleSort */
    std::vector<int>* ptrVec1 = new std::vector<int>{2, 0, 1, 8, 0, 5, 1, 3, 1, 7, 5, 5};
    Print(*ptrVec1);
    BubbleSort(*ptrVec1);
    Print(*ptrVec1);
    
    /* SelectionSort */
    std::vector<int>* ptrVec = new std::vector<int>{2, 0, 1, 8, 0, 5, 1, 2, 1, 2, 3, 2};

    Print(*ptrVec);
    SelectionSort(*ptrVec);
    Print(*ptrVec);
    
    /* InsertionSort */
    std::list<int>* ptrList = new std::list<int>{2, 0, 1, 8, 0, 5, 1, 3, 1, 7, 2, 9};
    Print(*ptrList);
    InsertionSort(*ptrList);
    Print(*ptrList);
    
    return 0;
}
