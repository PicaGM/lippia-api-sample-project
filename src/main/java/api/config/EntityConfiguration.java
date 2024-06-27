package api.config;

import services.CreateEntryService;
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
    CREATE_ENTRY {
        @Override
        public Class<?> getEntityService() {
            return CreateEntryService.class;
        }
    };

    public abstract Class<?> getEntityService();
}



