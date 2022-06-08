# Inner Class Lab

## Learning Goals

- Use inner classes in Java

## Introduction

Using the code we wrote together in the previous lesson as a baseline, create a
new method in the `GradeCalculator` interface that will return the number of
grade points needed for the numeric grade passed in to map to the next letter
grade. Let's call this method `howManyForNextLetter()` - here is its signature:

`public int howManyForNextLetterGrade(int numberGrade);`

For example, if numberGrade is 67, then this method will return 3 if the grading
method is "heavy", it will return 8 if the grading method is "slight" and 3 is
the grading method is "flat".
