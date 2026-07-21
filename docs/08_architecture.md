# Architecture

**Project:** Antenna  
**Status:** Draft  
**Version:** 0.1  
**Last Updated:** 30 June 2026  

---

## 1. Purpose

This document defines the initial architecture direction for Antenna.

The purpose of this document is to describe how the application should be structured at a high level before implementation begins.

This document is not intended to define every class, function, database table, or implementation detail. Those details will be refined during development.

---

## 2. Architecture Goals

Antenna shall be designed to support the project principles:

- Simple
- Efficient
- Responsive
- Practical
- Intuitive
- Transparent
- Maintainable
- Consistent

The architecture should provide a clean foundation without becoming unnecessarily complex.

Version 1 should prioritise a working, maintainable Android application over hypothetical future expansion.

---

## 3. Technology Direction

Antenna Version 1 is intended to use native Android development.

Initial technology direction:

```text
Platform:
Android

Language:
Kotlin

UI:
Jetpack Compose

Local Storage:
Android local storage/database, to be selected during implementation

Build System:
Gradle

Repository:
GitHub
```

This technology direction may be updated if a strong technical reason is identified.

Major changes should be recorded in the decision log.

---

## 4. Architectural Style

Antenna should use a modular architecture with clear separation of responsibilities.

The application should separate:

- User interface
- Navigation
- Application logic
- Data access
- Network access
- Local storage
- Settings
- Error handling
- Platform compatibility logic

The architecture should avoid placing all logic directly inside UI screens.

---

## 5. High-Level Architecture

The high-level application structure is:

```text
Antenna
|
|-- User Interface
|   |-- Screens
|   |-- Navigation
|   |-- Theme
|   `-- Reusable UI components
|
|-- Application Logic
|   |-- View models
|   |-- Screen state
|   |-- User actions
|   `-- Feature coordination
|
|-- Data Layer
|   |-- Repositories
|   |-- Data mapping
|   |-- Caching rules
|   `-- Data source coordination
|
|-- Network Layer
|   |-- Reddit-compatible API access
|   |-- Request handling
|   |-- Response parsing
|   `-- Network error handling
|
|-- Local Storage
|   |-- Local favourites
|   |-- Settings
|   |-- Cache
|   `-- Recently viewed data, where required
|
`-- Platform Services
    |-- Android permissions
    |-- External browser links
    |-- Media handling
    `-- System theme integration
```

---

## 6. Proposed Module Structure

The initial module structure should be simple but organised.

Proposed structure:

```text
Antenna
|
|-- app
|
|-- core-ui
|-- core-model
|-- core-data
|-- core-network
|-- core-database
|
|-- feature-home
|-- feature-search
|-- feature-explore
|-- feature-my-subs
|-- feature-settings
`-- feature-post-detail
```

This structure may be adjusted during implementation if it becomes too heavy for the initial build.

The project should not add modules purely for appearance. Each module must have a clear reason to exist.

---

## 7. Module Responsibilities

### 7.1 app

The `app` module is the Android application entry point.

Responsibilities:

- Application startup
- Main navigation setup
- Dependency wiring
- Application-level configuration
- Connecting feature modules

The `app` module should avoid containing detailed feature logic.

---

### 7.2 core-ui

The `core-ui` module contains shared user interface elements.

Responsibilities:

- App theme
- Typography
- Colours
- Shared buttons
- Shared loading states
- Shared error states
- Reusable layout components

The purpose of this module is to keep the interface consistent across the application.

---

### 7.3 core-model

The `core-model` module contains shared data models.

Examples:

- Community
- Post
- Comment
- User
- Feed
- Media item
- Sort option
- Content type

Models should represent application concepts rather than raw network responses.

---

### 7.4 core-data

The `core-data` module coordinates application data.

Responsibilities:

- Repositories
- Combining network and local data
- Mapping raw data to application models
- Deciding when to read from cache
- Deciding when to request fresh data

The data layer should hide implementation details from the user interface.

---

### 7.5 core-network

The `core-network` module handles network access.

Responsibilities:

- Reddit-compatible API requests
- Network response handling
- Network error handling
- Rate limit handling where detectable
- Network model definitions
- Platform access constraints

This module should isolate platform-specific network behaviour from the rest of the application where practical.

---

### 7.6 core-database

The `core-database` module handles local storage.

Responsibilities:

- Local favourites
- Application settings
- Feed cache where implemented
- Recently viewed communities where implemented
- Local data clearing

Local storage should be transparent and limited to data that serves a clear purpose.

---

### 7.7 feature-home

The `feature-home` module contains the Home screen.

Responsibilities:

- Display My Subs feed
- Feed sorting
- Feed loading state
- Feed empty state
- Feed error state
- Opening post detail

Home should remain focused on showing the user's main feed.

---

### 7.8 feature-search

The `feature-search` module contains Search.

Responsibilities:

- Search input
- Search targets
- Search content types
- Search sorting
- Search results
- Search empty state
- Search error state

Search is for direct lookup.

---

### 7.9 feature-explore

The `feature-explore` module contains Explore.

Responsibilities:

- Discovery browsing
- Content type browsing
- Popular or trending content where supported
- Community discovery where supported
- Explore sorting
- Explore result display

Explore is for discovery rather than direct lookup.

---

### 7.10 feature-my-subs

The `feature-my-subs` module contains local favourites management.

Responsibilities:

- Display locally saved communities
- Add community
- Remove community
- Open community
- Search within saved communities
- Alphabetical sorting

My Subs is local application data and does not require an online account.

---

### 7.11 feature-settings

The `feature-settings` module contains application settings.

Responsibilities:

- Appearance settings
- Content settings
- NSFW visibility
- Privacy information
- Account information
- FAQ
- About
- Cache and local data controls

Settings should remain clear and uncluttered.

---

### 7.12 feature-post-detail

The `feature-post-detail` module contains post and comment viewing.

Responsibilities:

- Display post detail
- Display text content
- Display media where supported
- Display comments
- Collapse and expand comments
- Handle deleted or removed comments
- Handle unsupported content

Post detail should prioritise reading and discussion navigation.

---

## 8. Data Flow

Antenna should use a predictable data flow.

Typical data flow:

```text
User action
    |
    v
UI screen
    |
    v
View model / application logic
    |
    v
Repository
    |
    v
Network and/or local storage
    |
    v
Repository maps result
    |
    v
View model updates screen state
    |
    v
UI displays result
```

The user interface should not directly perform network requests or database operations.

---

## 9. Screen State

Screens should represent state clearly.

Common screen states:

```text
Idle
Loading
Loaded
Empty
Error
Offline
Restricted
Unsupported
```

Each major screen should define how it behaves in these states.

Examples:

- Home with no My Subs should show an empty state.
- Search with no results should show a no-results state.
- A failed network request should show an error state with retry where practical.
- Restricted content should explain that access is restricted where practical.

---

## 10. Error Handling

Error handling should be consistent across the application.

The application should handle:

- Network failure
- Slow network
- Empty responses
- Invalid community names
- Restricted communities
- Unsupported content
- Deleted content
- Rate limits where detectable
- Unexpected data formats

Errors should be translated into clear user-facing messages.

Raw technical errors should not normally be shown to users.

---

## 11. Local Storage

Initial local storage requirements include:

- Local favourites
- Theme setting
- NSFW visibility setting
- Basic application preferences

Potential future local storage may include:

- Feed cache
- Recently viewed communities
- Search history
- Offline reading data
- Backup and restore data

Local storage should be limited to data that has a clear user benefit.

---

## 12. Local Favourites Architecture

Local favourites are a core feature of Antenna.

Local favourites should be stored independently of any platform account.

Suggested behaviour:

```text
Display format:
r/example

Storage format:
example
```

Local favourites should:

- Be stored locally
- Be alphabetically sorted
- Prevent duplicates
- Be usable without signing in
- Be available to Home for feed generation
- Be manageable from My Subs

Future versions may add grouping, backup, restore, import, or export.

---

## 13. NSFW Architecture

NSFW visibility is a global content setting.

Storage:

```text
Local setting:
nsfw_visibility_enabled = true / false
```

Default:

```text
false
```

Behaviour:

- NSFW content is hidden or restricted by default.
- The user must confirm they are over 18 before enabling NSFW visibility.
- The setting applies globally to Home, Search, Explore, community feeds, post detail, and media views.
- The setting does not override platform restrictions.
- If Reddit requires an authenticated account or account-level setting, Antenna must respect that requirement.

---

## 14. Network Layer

The network layer should be isolated from the UI.

The UI should request data through repositories rather than directly through network clients.

The network layer should handle:

- Request construction
- Response parsing
- Network errors
- Platform limitations
- Rate limits where detectable
- Authentication requirements where implemented

The application should not be designed around bypassing platform restrictions.

---

## 15. Platform Compatibility

Version 1 targets compatibility with Reddit.

The architecture should avoid unnecessary coupling where practical, but multi-platform support is not a Version 1 objective.

This means:

- Reddit compatibility is the initial target.
- Multiple provider support is out of scope.
- The code should still be organised cleanly enough that future changes remain possible.
- The project should not build a generic plugin system in Version 1.

---

## 16. Account Support

Account support is not required for the initial Version 1 foundation.

If implemented later, account support may include:

- Login
- Voting
- Commenting
- Posting
- Reporting
- Platform-managed subscriptions
- Messages
- Notifications

Anonymous browsing should remain available where supported.

Account-required features should be clearly separated from anonymous features.

---

## 17. Privacy Architecture

Privacy should be considered at the architecture level.

Antenna shall not include by default:

- Advertising
- Telemetry
- Analytics
- Unnecessary tracking
- Unnecessary permissions

If future diagnostics are considered, they must be:

- Clearly documented
- Justified
- Optional
- Opt-in

---

## 18. Dependency Policy

Dependencies should be added deliberately.

A dependency should only be added when it provides clear value.

Before adding a dependency, consider:

- Does Android already provide this capability?
- Is the dependency actively maintained?
- Does it introduce privacy concerns?
- Does it increase application size significantly?
- Does it make the code easier or harder to understand?
- Is the dependency necessary for Version 1?

The project should avoid dependency bloat.

---

## 19. Testing Direction

The architecture should support testing.

Initial testing may be manual during early pre-alpha development.

Over time, testing should include:

- Unit tests for application logic
- Repository tests
- Local storage tests
- Network response mapping tests
- UI tests for critical flows where practical

Critical flows include:

- Launch app
- Open Home
- Search community
- Add local favourite
- Open community
- Open post
- Read comments
- Change settings

---

## 20. Build and Release Direction

The project should be buildable from source using documented steps.

Future build documentation should include:

- Required software
- Android Studio version
- JDK version
- Build commands
- Common setup issues
- How to run the app on a device or emulator

Versioning should use clear pre-release identifiers during early development.

Example:

```text
0.0.1-prealpha
0.1.0
0.2.0
1.0.0
```

---

## 21. Architecture Constraints

The architecture shall respect the following constraints:

- Android only for Version 1
- Kotlin-first development
- Native Android user interface
- Reddit compatibility as the initial target
- Anonymous browsing where supported
- No advertising within the application
- No telemetry or analytics by default
- Local favourites stored on device
- NSFW visibility controlled through Settings
- No multi-platform provider system in Version 1

---

## 22. Out of Scope for Initial Architecture

The following are out of scope for the initial architecture:

- iOS support
- Desktop support
- Web client
- Multi-provider plugin system
- Cloud sync
- AI features
- Advanced moderation tools
- Full account system
- In-app purchases
- Advertising systems
- Telemetry systems

These may be reconsidered later only if they align with the project principles and there is a clear requirement.

---

## 23. Summary

Antenna should use a clean, modular native Android architecture.

The architecture should support:

- Fast browsing
- Clear navigation
- Local favourites
- Search
- Explore
- Settings
- Post and comment viewing
- Privacy-conscious defaults
- Maintainable open-source development

The architecture should remain simple enough to implement Version 1 without unnecessary abstraction, while being organised enough to support future growth.
