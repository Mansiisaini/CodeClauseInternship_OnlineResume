// Resume class representing the resume details
class Resume {
    private String fullName;
    private String email;
    private String phone;
    private String workExperience;
    private String education;

    // Constructor
    public Resume(String fullName, String email, String phone, String workExperience, String education) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.workExperience = workExperience;
        this.education = education;
    }

    // Getters and setters
    // ...

    // Method to generate the resume content
    public String generateResume() {
        StringBuilder resumeContent = new StringBuilder();
        resumeContent.append("Full Name: ").append(fullName).append("\n");
        resumeContent.append("Email: ").append(email).append("\n");
        resumeContent.append("Phone: ").append(phone).append("\n");
        resumeContent.append("Work Experience: ").append(workExperience).append("\n");
        resumeContent.append("Education: ").append(education).append("\n");

        return resumeContent.toString();
    }
}

public class Resume1 {
    public static void main(String[] args) {
        // Sample data for the resume
        String fullName = "Mansi saini";
        String email = "mansi.saini@example.com";
        String phone = "+1 456-890-7890";
        String workExperience = "Software Engineer at XYZ Inc.";
        String education = "Bachelor of Computer Science";

        // Create a new Resume object
        Resume resume = new Resume(fullName, email, phone, workExperience, education);

        // Generate the resume content and display it
        String resumeContent = resume.generateResume();
        System.out.println(resumeContent);
    }
}
