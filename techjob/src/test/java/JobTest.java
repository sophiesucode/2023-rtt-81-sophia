
import com.suleman.techjob.model.Job;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JobTest {

    @ParameterizedTest
    @CsvSource({
            "1, Entry Level, Software Engineer, 80000, Description, Tech Company, Location, http://example.com, http://example.com/image.jpg",
            "2, Mid Level, Data Scientist, 90000, Description, Data Company, Location, http://example.com, http://example.com/image.jpg",
            "3, Junior Level, Web Developer, 75000, Description, Web Agency, Location, http://example.com, http://example.com/image.jpg"
    })
    void testJobConstructorAndGetters( String experienceLevel, String jobTitle, String salary, String jobDescription, String company, String location, String url, String imgUrl) {
        // Arrange
        Job job = new Job(experienceLevel, jobTitle, salary, jobDescription, company, location, url, imgUrl);

        // Act & Assert
       // assertEquals(id, job.getId());
        assertEquals(experienceLevel, job.getExperienceLevel());
        assertEquals(jobTitle, job.getJobTitle());
        assertEquals(salary, job.getSalary());
        assertEquals(jobDescription, job.getJobDescription());
        assertEquals(company, job.getCompany());
        assertEquals(location, job.getLocation());
        assertEquals(url, job.getUrl());
        assertEquals(imgUrl, job.getImgUrl());
    }
}
