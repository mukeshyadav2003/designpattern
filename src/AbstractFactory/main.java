package AbstractFactory;

public class main {

	public static void main(String[] args){
		                                                            //new  CourseFactory();
                  SourceCourseFactory course = FactoryCreator.getSourceCourseFactory("course");
                                                   //new ProgrammingCourse();
                  System.out.println(course.getCourse("programming").getCourseName());
                  
                  
                                                                   // new  SourceFactory();
                  SourceCourseFactory source = FactoryCreator.getSourceCourseFactory("source");
                                              //new Online();
                  System.out.println(source.getSource("online").getSourceName());

	}
}