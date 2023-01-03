package School_Level;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class CarServiceStation {
    public static void main(String[] args) {

                // Create a hatchback car
                // Car hatchback = new Car("Hatchback");
                Car hatchback = new Car("SUV");

                // Request services for the hatchback car
                ServiceRequest request = new ServiceRequest(hatchback);
                request.addService("BS01");
                request.addService("EF01");

                // Generate and print the bill for the service request
                Bill bill = new Bill(request);
                System.out.println(bill.generateBill());
            }
        }

        class Car {
            private String type;

            public Car(String type) {
                this.type = type;
            }

            public String getType() {
                return type;
            }
        }

        class ServiceRequest {
            private Car car;
            private List<String> serviceCodes;

            public ServiceRequest(Car car) {
                this.car = car;
                this.serviceCodes = new ArrayList<>();
            }

            public void addService(String code) {
                serviceCodes.add(code);
            }

            public Car getCar() {
                return car;
            }

            public List<String> getServiceCodes() {
                return serviceCodes;
            }
        }

        class Bill {
            private ServiceRequest request;

            HashMap<String, String> hm = new HashMap<String, String>();

            public Bill(ServiceRequest request) {
                this.request = request;

                hm.put("BS01", "Basic Servicing");
                hm.put("EF01", "Engine Fixing");
                hm.put("CF01", "Clutch Fixing");
                hm.put("BF01", "Brake Fixing");
                hm.put("GF01", "Gear Fixing");
            }

            private String getServiceName(String code)
            {
                return this.hm.get(code);
            }

            public String generateBill() {
                StringBuilder sb = new StringBuilder();
                sb.append("Type of Car: " + request.getCar().getType() + "\n");
                sb.append("Service Codes: " + request.getServiceCodes() + "\n");

                int totalBill = 0;
                for (String code : request.getServiceCodes()) {
                    int cost = getCostForService(code, request.getCar().getType());
                    sb.append("Charges for "+ getServiceName(code)  + ": ₹ " + cost + "\n");
                    totalBill += cost;
                }

                sb.append("Total Bill: ₹ " + totalBill + "\n");
                if (totalBill > 10000) {
                    sb.append("Complimentary cleaning provided\n");
                }
                return sb.toString();
            }

            private int getCostForService(String code, String carType) {
                if (carType.equals("Hatchback")) {
                    switch(code) {
                        case "BS01": return 2000;
                        case "EF01": return 5000;
                        case "CF01": return 2000;
                        case "BF01": return 1000;
                        case "GF01": return 3000;
                        default: return 0;
                    }
                }
                else if (carType.equals("Sedan"))
                {
                    switch(code) {
                        case "BS01": return 4000;
                        case "EF01": return 8000;
                        case "CF01": return 4000;
                        case "BF01": return 1500;
                        case "GF01": return 6000;
                        default: return 0;
                    }
                }
                else if (carType.equals("SUV"))
                {
                    switch(code) {
                        case "BS01": return 5000;
                        case "EF01": return 10000;
                        case "CF01": return 6000;
                        case "BF01": return 2500;
                        case "GF01": return 8000;
                        default: return 0;
                    }
                }
                else
                {
                    return 0;
                }

            }
        }
