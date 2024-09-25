public class CustomerSpending {

    public static String getTopCustomerBySpending(List<Map<String, Object>> queryResults) {

        String topCustomer = null;
        double highestSpent = 0.0;

        for(Map<String, Object> record : queryResults) {
            String customerName = (String) record.get("CustomerName");
            double totalSpent = (Double) record.get("TotalSpent");

            if(totalSpent > highestSpent) {
                highestSpent = totalSpent;
                topCustomer = customerName;
            } 
        }

        return topCustomer != null ? topCustomer + ": " + highestSpent : "No customers found";
    }

    public static void main(String[] args) {

        // Assuming we are fetching data from backend
        List<Map<String, Object>> queryResults = fetchQueryResults();

        String topCustomer = getTopCustomerBySpending(queryResults);
        System.out.println("Highest Spending Customer : " + topCustomer);
    }
}