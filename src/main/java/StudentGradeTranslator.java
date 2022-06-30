
public class StudentGradeTranslator {

  GradeCalculator gradeCalculator;
  int numToNextLetterGrade;

  public StudentGradeTranslator() {
    this.gradeCalculator = new FlatCurveGradeCalculator();
  }

  public StudentGradeTranslator(String gradingMethod) {
    if (gradingMethod == null) {
      this.gradeCalculator = new FlatCurveGradeCalculator();
    } else if (gradingMethod.equals("FLAT")) {
      this.gradeCalculator = new FlatCurveGradeCalculator();
    } else if (gradingMethod.equals("SLIGHT")) {
      this.gradeCalculator = new SlightCurveGradeCalculator();
    } else if (gradingMethod.equals("HEAVY")) {
      this.gradeCalculator = new HeavyCurveGradeCalculator();
    }
  }

  public String getLetterGrade(int numberGrade) {
    return gradeCalculator.getLetterGrade(numberGrade);
  }

  public boolean isPassingGrade(int numberGrade) {
    return gradeCalculator.isPassingGrade(numberGrade);
  }

  public int howManyForNextLetterGrade(int numberGrade) {
    return gradeCalculator.howManyForNextLetterGrade(numberGrade);
  }

  interface GradeCalculator {
    public String getLetterGrade(int numberGrade);

    public boolean isPassingGrade(int numberGrade);

    public int howManyForNextLetterGrade(int numberGrade);
  }

  class FlatCurveGradeCalculator implements GradeCalculator {

    public String getLetterGrade(int numberGrade) {
      if (numberGrade < 60) {
        return "F";
      }
      if (numberGrade < 70) {
        return "D";
      }
      if (numberGrade < 80) {
        return "C";
      }
      if (numberGrade < 90) {
        return "B";
      }
      return "A";
    }

    public boolean isPassingGrade(int numberGrade) {
      if (numberGrade >= 60)
        return true;
      return false;
    }

    @Override
    public int howManyForNextLetterGrade(int numberGrade) {
      String letterGrade = getLetterGrade(numberGrade);

      if (letterGrade.equals("F")) {
        return 60 - numberGrade;
      }
      if (letterGrade.equals("D")) {
        return 70 - numberGrade;
      }
      if (letterGrade.equals("C")) {
        return 80 - numberGrade;
      }
      if (letterGrade.equals("B")) {
        return 90 - numberGrade;
      }

      return 0;

    }
  }

  class SlightCurveGradeCalculator implements GradeCalculator {
    public String getLetterGrade(int numberGrade) {
      if (numberGrade < 55) {
        return "F";
      }
      if (numberGrade < 65) {
        return "D";
      }
      if (numberGrade < 75) {
        return "C";
      }
      if (numberGrade < 85) {
        return "B";
      }
      return "A";
    }

    public boolean isPassingGrade(int numberGrade) {
      if (numberGrade >= 55)
        return true;
      return false;
    }

    @Override
    public int howManyForNextLetterGrade(int numberGrade) {
      String letterGrade = getLetterGrade(numberGrade);

      if (letterGrade.equals("F")) {
        return 55 - numberGrade;
      }
      if (letterGrade.equals("D")) {
        return 65 - numberGrade;
      }
      if (letterGrade.equals("C")) {
        return 75 - numberGrade;
      }
      if (letterGrade.equals("B")) {
        return 85 - numberGrade;
      }

      return 0;

    }
  }

  class HeavyCurveGradeCalculator implements GradeCalculator {
    public String getLetterGrade(int numberGrade) {
      if (numberGrade < 50) {
        return "F";
      }
      if (numberGrade < 60) {
        return "D";
      }
      if (numberGrade < 70) {
        return "C";
      }
      if (numberGrade < 80) {
        return "B";
      }
      return "A";
    }

    public boolean isPassingGrade(int numberGrade) {
      if (numberGrade >= 50)
        return true;
      return false;
    }

    @Override
    public int howManyForNextLetterGrade(int numberGrade) {
      String letterGrade = getLetterGrade(numberGrade);

      if (letterGrade.equals("F")) {
        return 50 - numberGrade;
      }
      if (letterGrade.equals("D")) {
        return 60 - numberGrade;
      }
      if (letterGrade.equals("C")) {
        return 70 - numberGrade;
      }
      if (letterGrade.equals("B")) {
        return 80 - numberGrade;
      }

      return 0;

    }
  }

}
