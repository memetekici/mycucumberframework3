
  Feature: Verify_Record_Not_Found_message
    Scenario: TC_01_verify_record_not_found_message_for_USB_flash_drivers
      Given User go on the global trader webpage
      And click on the Computer&Office button
      And click the USB Flash Drives button
      Then Verify "Record Not Found" message