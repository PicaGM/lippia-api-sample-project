package api.config;

import services.AddTimeEntryService;
import services.DeleteEntryService;
import services.EditEntryService;
import services.TimeEntryService;

public enum EntityConfiguration {
    GET_TIME {
        @Override
        public Class<?> getEntityService() {
            return TimeEntryService.class;
        }
    },
    EDIT_TIME {
        @Override
        public Class<?> getEntityService() {
            return EditEntryService.class;
        }
    },
    ADD_TIME {
        @Override
        public Class<?> getEntityService() {
            return AddTimeEntryService.class;
        }
    },
    DELETE_ENTRY {
        @Override
        public Class<?> getEntityService() {
            return DeleteEntryService.class;
        }
    };

    public abstract Class<?> getEntityService();
}



