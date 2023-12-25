import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author srinandhini
 */
public class sportsservlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String s=request.getParameter("c");
        ArrayList<String>sports=new ArrayList<>();
        try (PrintWriter out = response.getWriter()) {
            out.println("<h1><center> TEAM DETAILS!</center></h1>");
        if(s.equals("Bengal warriors"))
      {
      sports.add("The team BENGAL WARRIORS has 12 members");
      sports.add(" ");
            sports.add("Maninder Singh - Raiders");
             sports.add(" ");
            sports.add("Parshant Kumar- Raiders ");
             sports.add(" ");
            sports.add("R Guhan- Raiders ");
             sports.add(" ");
            sports.add("Suyog Baban Gaikar- Raiders");
             sports.add(" ");
            sports.add("Aslam Saja Mohamed- Raiders");
             sports.add(" ");
            sports.add("Ajinkya Rohidas Kapre- All Rounders");
             sports.add(" ");
            sports.add("Ashish Kumar Sangwan- All Rounders");
             sports.add(" ");
            sports.add("Amit Sheoran-Defenders");
             sports.add(" ");
            sports.add("Parveen Satpal-Defenders");
             sports.add(" ");
            sports.add("Sakthivel-Defenders");
             sports.add(" ");
            sports.add("Shubham Shinde-Defenders");
             sports.add(" ");
            sports.add("Surender Nada-Defenders");
             sports.add(" ");
      }
      else if(s.equals("tamil thalaivas"))
       {
            sports.add("The team TAMIL THALAIVAS has 12 memebers");
            sports.add(" ");
            sports.add("Pawan Sehrawat - Raiders");
            sports.add(" ");
            sports.add("Ajinkya Pawar - Raiders ");
            sports.add(" ");
            sports.add("Himanshu - Raiders ");
             sports.add(" ");
            sports.add("Narender - Raiders");
             sports.add(" ");
            sports.add("Sachin - Raiders");
             sports.add(" ");
            sports.add("Abhimanyu - All Rounders");
             sports.add(" ");
            sports.add("Visvanath V - All Rounders");
             sports.add(" ");
            sports.add("Aashish(Left Cover)-Defenders");
             sports.add(" ");
            sports.add("Mohit(Left Cover)-Defenders");
             sports.add(" ");
            sports.add("Ankit-Defenders");
             sports.add(" ");
            sports.add("Sagar(Right Corner)-Defenders");
             sports.add(" ");
            sports.add("Arpit Saroha(Right Corner)-Defenders");
             sports.add(" ");
       }
      else if(s.equals("telugu titans"))
      {
          sports.add("The team TELUGU TITANS has 12 members");
           sports.add(" ");
            sports.add("Monu Goyat- Raiders");
            sports.add(" ");
            sports.add("Ankit Beniwal- Raiders ");
            sports.add(" ");
            sports.add("Rajnish- Raiders ");
             sports.add(" ");
            sports.add("Abhishek Singh- Raiders");
             sports.add(" ");
            sports.add("Aman Kadian- Raiders");
             sports.add(" ");
            sports.add("Mohsen Maghsodlou- All Rounders");
             sports.add(" ");
            sports.add("Ravinder- All Rounders");
             sports.add(" ");
            sports.add("Vishal Bhardwaj-Defenders");
             sports.add(" ");
            sports.add("Muhammad Shihas-Defenders");
             sports.add(" ");
            sports.add("Ramakrishna-Defenders");
             sports.add(" ");
            sports.add("Mohit-Defenders");
             sports.add(" ");
            sports.add("Nitin-Defenders");
             sports.add(" ");
      }
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet sportsservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            for(String st:sports){
                out.println(st+"<br>");
            }
            //out.println("<h1>Servlet sportsservlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>