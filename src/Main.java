product.productName + " → Stock Available"
                            );
                        }

                        System.out.println("-----------------------------");
                    }
                }
            }

            // 4. Search Product
            else if (choice == 4) {

                sc.nextLine();

                System.out.print("Enter product name to search: ");
                String searchName = sc.nextLine();

                boolean found = false;

                for (Product product : products) {

                    if (product.productName.equalsIgnoreCase(searchName)) {

                        System.out.println("\nProduct Found!");
                        System.out.println("Product ID: " + product.productId);
                        System.out.println("Product Name: " + product.productName);
                        System.out.println("Quantity: " + product.quantity);
                        System.out.println("Reorder Level: " + product.reorderLevel);
                        System.out.println("Price: ₹" + product.price);

                        found = true;
                        break;
                    }
                }

                if (!found) {

                    System.out.println("Product not found.");
                }
            }

            // 5. Update Quantity
            else if (choice == 5) {

                System.out.print("Enter Product ID: ");
                int id = sc.nextInt();

                boolean found = false;

                for (Product product : products) {

                    if (product.productId == id) {

                        System.out.print("Enter new quantity: ");
                        int newQuantity = sc.nextInt();

                        product.quantity = newQuantity;

                        System.out.println(
                            "Quantity updated successfully!"
                        );

                        found = true;
                        break;
                    }
                }

                if (!found) {

                    System.out.println("Product not found.");
                }
            }

            // 6. Delete Product
            else if (choice == 6) {

                System.out.print("Enter Product ID to delete: ");
                int id = sc.nextInt();

                boolean found = false;

                for (int i = 0; i < products.size(); i++) {

                    if (products.get(i).productId == id) {

                        products.remove(i);

                        System.out.println(
                            "Product deleted successfully!"
                        );

                        found = true;
                        break;
                    }
                }

                if (!found) {

                    System.out.println("Product not found.");
                }
            }

            // 7. Exit
            else if (choice == 7) {

                System.out.println("\nExiting the system...");
            }

            else {

                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
