# Warehouse Inventory and Reorder System - Design

## 1. System Overview

The system manages warehouse products and monitors their stock levels. It compares the available quantity of a product with its reorder level and identifies products that need to be reordered.

## 2. Main Components

The system will contain the following main components:

- Product Management
- Inventory Management
- Stock Monitoring
- Reorder Management
- Search and Display

## 3. Product Information

Each product will contain information such as:

- Product ID
- Product Name
- Quantity
- Reorder Level
- Price

## 4. Basic System Flow

1. Start the application.
2. Add or load product information.
3. Display available products.
4. Check the current stock quantity.
5. Compare stock quantity with the reorder level.
6. Identify low-stock products.
7. Display reorder information.
8. Exit the application.

## 5. Reorder Logic

The system will compare the available quantity with the reorder level.

If:

Available Quantity <= Reorder Level

then the product will be marked as requiring reorder.

Otherwise, the product will be considered sufficiently stocked.

## 6. Future Implementation

The system will initially be developed as a Java-based application. Additional features such as file storage, a graphical user interface, and database connectivity may be added in later stages.
