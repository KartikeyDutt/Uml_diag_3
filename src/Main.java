import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating equipment and setting its properties
        Equipment equipment = new Equipment();
        equipment.addProperty(new EquipmentProperty("Weight", "100 kg"));
        equipment.addProperty(new EquipmentProperty("Color", "Blue"));

        // Creating equipment class and setting its class properties
        EquipmentClass equipmentClass = new EquipmentClass();
        equipmentClass.addClassProperty(new EquipmentClassProperty("Model", "ABC123"));
        equipmentClass.addClassProperty(new EquipmentClassProperty("Manufacturer", "XYZ Inc."));

        // Creating physical asset and setting its properties
        PhysicalAsset physicalAsset = new PhysicalAsset();
        physicalAsset.addProperty(new PhysicalAssetProperty("Weight", "250.5 kg"));
        physicalAsset.addProperty(new PhysicalAssetProperty("Color", "Red"));

        // Creating physical asset class and setting its class properties
        PhysicalAssetClass physicalAssetClass = new PhysicalAssetClass();
        physicalAssetClass.addClassProperty(new PhysicalAssetClassProperty("Model", "DEF456"));
        physicalAssetClass.addClassProperty(new PhysicalAssetClassProperty("Manufacturer", "PQR Corp."));

        // Creating equipment asset mappings
        EquipmentAssetMapping mapping1 = new EquipmentAssetMapping(physicalAsset, equipment);
        EquipmentAssetMapping mapping2 = new EquipmentAssetMapping(physicalAsset, equipmentClass);

        // Creating role-based equipment
        RoleBasedEquipment roleBasedEquipment = new RoleBasedEquipment("Role X");

        // Displaying properties of Equipment
        System.out.println("Equipment Properties:");
        List<EquipmentProperty> equipmentProperties = equipment.getProperties();
        for (EquipmentProperty property : equipmentProperties) {
            System.out.println(property.getName() + ": " + property.getValue());
        }

        // Displaying properties of PhysicalAsset
        System.out.println("\nPhysical Asset Properties:");
        List<PhysicalAssetProperty> physicalAssetProperties = physicalAsset.getProperties();
        for (PhysicalAssetProperty property : physicalAssetProperties) {
            System.out.println(property.getName() + ": " + property.getValue());
        }

        // Displaying class properties of EquipmentClass
        System.out.println("\nEquipment Class Properties:");
        List<EquipmentClassProperty> equipmentClassProperties = equipmentClass.getClassProperties();
        for (EquipmentClassProperty classProperty : equipmentClassProperties) {
            System.out.println(classProperty.getName() + ": " + classProperty.getDescription());
        }

        // Displaying class properties of PhysicalAssetClass
        System.out.println("\nPhysical Asset Class Properties:");
        List<PhysicalAssetClassProperty> physicalAssetClassProperties = physicalAssetClass.getClassProperties();
        for (PhysicalAssetClassProperty classProperty : physicalAssetClassProperties) {
            System.out.println(classProperty.getName() + ": " + classProperty.getDescription());
        }

        // Output other associations if needed
    }
}