package com.ipn.escom.neuropsi.oauth.server.entity.values;

public enum Role {
  ADMINISTRATOR("ADMINISTRATOR"), SPECIALIST("SPECIALIST"), PATIENT("PATIENT");

  String roleValue;

  Role(String role) {
    roleValue = role;
  }

}
