package AbstractFactory;

public class main {

	public static void main(String[] args){
		                                                            //CourseFactory();
                  SourceCourseFactory course = FactoryCreator.getSourceCourseFactory("course");
                  
                  System.out.println(course.getCourse("programming").getCourseName());
                  
                  
                                                                   //SourceFactory();
                  SourceCourseFactory source = FactoryCreator.getSourceCourseFactory("source");
                  
                  System.out.println(source.getSource("online").getSourceName());

	}
}