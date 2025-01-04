#!/bin/bash

llvm-as output.ll -o output.bc


llc output.bc -o output.s


gcc output.s -o output

