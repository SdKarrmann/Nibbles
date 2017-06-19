I-Logix-RPY-Archive version 8.7.1 Java 5066837
{ IProject 
	- _ownerHandle = { IHandle 
		- _m2Class = "";
	}
	- _id = GUID 3fb894a4-6d85-40bd-bf49-31d72d39234e;
	- _myState = 8192;
	- _name = "Nibbles";
	- _UserColors = { IRPYRawContainer 
		- size = 16;
		- value = 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 16777215; 
	}
	- _defaultSubsystem = { ISubsystemHandle 
		- _m2Class = "ISubsystem";
		- _filename = "Default.sbs";
		- _subsystem = "";
		- _class = "";
		- _name = "Default";
		- _id = GUID 47ba7bde-9ee5-431d-bbac-18be9f23f710;
	}
	- _component = { IHandle 
		- _m2Class = "IComponent";
		- _filename = "DefaultComponent.cmp";
		- _subsystem = "";
		- _class = "";
		- _name = "DefaultComponent";
		- _id = GUID 79c53c48-2a1b-4dea-9c0a-9450e85db883;
	}
	- Multiplicities = { IRPYRawContainer 
		- size = 4;
		- value = 
		{ IMultiplicityItem 
			- _name = "1";
			- _count = -1;
		}
		{ IMultiplicityItem 
			- _name = "*";
			- _count = -1;
		}
		{ IMultiplicityItem 
			- _name = "0,1";
			- _count = -1;
		}
		{ IMultiplicityItem 
			- _name = "1..*";
			- _count = -1;
		}
	}
	- Subsystems = { IRPYRawContainer 
		- size = 3;
		- value = 
		{ ISubsystem 
			- fileName = "Default";
			- _id = GUID 47ba7bde-9ee5-431d-bbac-18be9f23f710;
		}
		{ IProfile 
			- fileName = "SoftwareArchitect752Java";
			- _persistAs = "$OMROOT\\Settings\\SoftwareArchitect";
			- _id = GUID 71502165-9f78-4039-a7f8-1dad3a73ac54;
			- _name = "SoftwareArchitectJava";
			- _isReference = 1;
		}
		{ IProfile 
			- fileName = "JavaDocProfile";
			- _persistAs = "$OMROOT\\Profiles\\JavaDoc\\";
			- _id = GUID 19700e28-456f-4c97-a19c-b95dcb3e9dff;
			- _isReference = 1;
		}
	}
	- Diagrams = { IRPYRawContainer 
		- size = 0;
	}
	- Components = { IRPYRawContainer 
		- size = 1;
		- value = 
		{ IComponent 
			- fileName = "DefaultComponent";
			- _id = GUID 79c53c48-2a1b-4dea-9c0a-9450e85db883;
		}
	}
}

