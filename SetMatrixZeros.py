from math import *
from collections import *
from sys import *
from os import *

from typing import List

def setZeros(matrix: List[List[int]]) -> None:
	# Write your code here.
    m = len(matrix)
    n = len(matrix[0]) 

    for i in range(m):
        for j in range(n):
            if(matrix[i][j] == 0):
                for k in range(n):
                    if(matrix[i][k] == 0):
                        matrix[i][k] = None
                    else:
                        matrix[i][k] = 0
                break
    
    for j in range(n):
        for i in range(m):
            if(matrix[i][j] == None):
                for k in range(m):
                    matrix[k][j] = 0
                break
    pass
