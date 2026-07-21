# Decision Log

**Project:** Antenna  
**Status:** Draft  
**Version:** 0.1  
**Last Updated:** 30 June 2026

## 1. Purpose

This document records significant product, architecture, and project decisions for Antenna.

The purpose of the decision log is to preserve reasoning behind important choices so future contributors can understand not only what was decided, but why it was decided.

This document is not intended to record every conversation or minor change. It should record decisions that affect project scope, architecture, implementation, user experience, privacy, compatibility, policy compliance, or maintainability.

## 2. Decision record format

Each decision should include:

- Decision ID.
- Title.
- Status.
- Date.
- Context.
- Decision.
- Rationale.
- Consequences.

Decision statuses may include:

- Proposed.
- Accepted.
- Superseded.
- Rejected.
- Deprecated.

## 3. Decision register

| ID | Title | Status | Date |
| --- | --- | --- | --- |
| ADR-001 | Project Name | Accepted | 30 June 2026 |
| ADR-002 | Native Android Application | Accepted | 30 June 2026 |
| ADR-003 | Version 1 Compatibility Target | Accepted | 30 June 2026 |
| ADR-004 | Local Favourites | Accepted | 30 June 2026 |
| ADR-005 | No Advertising Within Application | Accepted | 30 June 2026 |
| ADR-006 | Privacy-First Default Position | Accepted | 30 June 2026 |
| ADR-007 | Documentation-First Project Setup | Accepted | 30 June 2026 |
| ADR-008 | Avoid Over-Engineering Version 1 | Accepted | 30 June 2026 |
| ADR-009 | Primary Navigation Model | Proposed | 30 June 2026 |
| ADR-010 | Modular Android Architecture Direction | Proposed | 30 June 2026 |
| ADR-011 | Local NSFW Visibility Setting | Proposed | 30 June 2026 |
| ADR-012 | Dependency Minimalism | Proposed | 30 June 2026 |
| ADR-013 | Initial Android Skeleton Baseline | Accepted | 30 June 2026 |

---

# ADR-001: Project Name

**Status:** Accepted
**Date:** 30 June 2026

## Context

The project requires a short, memorable name that does not directly use Reddit branding.

The name should be suitable for an open-source Android application and should not restrict the project identity to a single platform.

## Decision

The project name shall be:

**Antenna**

## Rationale

The name is short, memorable, and relevant to the concept of receiving community-driven information.

It avoids direct platform branding while still fitting the purpose of the application.

## Consequences

The project can be described independently while still targeting compatibility with Reddit for Version 1.

The project should include a clear disclaimer that it is independent and not affiliated with, endorsed by, or sponsored by Reddit.

---

# ADR-002: Native Android Application

**Status:** Accepted  
**Date:** 30 June 2026

## Context

Antenna is intended to provide a fast, responsive, practical, and intuitive Android experience.

Several implementation options are possible, including native Android, cross-platform frameworks, or web-based approaches.

## Decision

Antenna Version 1 shall be developed as a native Android application.

The expected technology stack is:

- Kotlin.
- Jetpack Compose.
- Native Android tooling.

## Rationale

Native Android development supports strong platform integration, good performance, maintainability, and access to Android-specific capabilities.

This approach aligns with the project principles of simplicity, efficiency, responsiveness, and practicality.

## Consequences

The initial project will focus only on Android.

iOS, desktop, and web versions are outside the scope of Version 1.

---

# ADR-003: Version 1 Compatibility Target

**Status:** Accepted  
**Date:** 30 June 2026

## Context

Antenna is intended to browse community-driven discussion content.

The project should not unnecessarily describe itself as permanently tied to a single provider. However, Version 1 needs a clear compatibility target to avoid excessive complexity.

## Decision

Antenna Version 1 shall target compatibility with Reddit.

The project documentation may describe the application more generally as a client for community-driven discussion platforms while clearly stating that Version 1 is initially compatible with Reddit.

## Rationale

This provides a clear development target while avoiding unnecessary branding dependency.

The project does not need to support multiple platforms in Version 1.

## Consequences

The architecture should avoid unnecessary coupling where practical, but extensibility beyond Reddit is not a Version 1 objective.

Multiple provider support is out of scope for Version 1.

---

# ADR-004: Local Favourites

**Status:** Accepted  
**Date:** 30 June 2026

## Context

Users should be able to personalise their browsing experience without creating or signing into an online account.

Platform-managed subscriptions generally require an authenticated account.

## Decision

Antenna shall support local favourites.

Users shall be able to favourite communities locally, and those favourites shall be stored on the device.

Local favourites shall remain separate from platform-managed subscriptions.

## Rationale

Local favourites allow anonymous users to customise their browsing experience.

This supports privacy, simplicity, and user control.

## Consequences

Local favourites will not automatically sync across devices.

Future versions may add backup, restore, import, export, grouping, or optional sync.

---

# ADR-005: No Advertising Within Application

**Status:** Accepted  
**Date:** 30 June 2026

## Context

Antenna is intended to provide a clean and user-focused browsing experience.

Advertising, advertising SDKs, and sponsored content introduced by the application would conflict with the project principles.

## Decision

Antenna shall not include advertising of its own.

## Rationale

Removing application-owned advertising supports simplicity, privacy, responsiveness, and transparency.

## Consequences

The project will not use advertising as a funding mechanism.

Any external content, platform-served content, or platform restrictions must be handled according to the applicable platform access method and policies.

---

# ADR-006: Privacy-First Default Position

**Status:** Accepted  
**Date:** 30 June 2026

## Context

Antenna is intended to be transparent and respectful of the user.

Many applications include analytics, telemetry, tracking, or unnecessary data collection by default.

## Decision

Antenna shall not include telemetry or analytics by default.

The application shall request only permissions required for implemented functionality.

## Rationale

This supports the project principles of transparency, simplicity, and user control.

## Consequences

The project may have less automatic diagnostic information available.

If diagnostics or telemetry are ever considered, they must be explicitly documented, justified, optional, and opt-in.

---

# ADR-007: Documentation-First Project Setup

**Status:** Accepted  
**Date:** 30 June 2026

## Context

The project is being established before application code is written.

Clear documentation is required to define scope, requirements, project principles, and future development direction.

## Decision

Antenna shall begin with project documentation before application implementation.

Initial documentation includes:

- Vision.
- Project Principles.
- Scope of Works.
- Functional Requirements.
- Non-Functional Requirements.
- Decision Log.
- UI/UX Specification.
- Architecture.

## Rationale

A documentation-first approach creates a clear foundation and reduces ambiguity before implementation begins.

It also supports maintainability, traceability, and future contribution.

## Consequences

Initial progress will focus on documentation rather than code.

Implementation decisions should trace back to documented requirements and principles.

---

# ADR-008: Avoid Over-Engineering Version 1

**Status:** Accepted  
**Date:** 30 June 2026

## Context

Antenna could theoretically be designed as a generic multi-platform client for many community discussion services.

However, designing for hypothetical future platforms would add complexity before a working Version 1 exists.

## Decision

Antenna Version 1 shall avoid unnecessary abstraction and over-engineering.

The project should remain modular and maintainable, but it shall not build a multi-provider architecture unless there is a current and justified need.

## Rationale

This supports the project principles of simplicity, efficiency, practicality, and maintainability.

The immediate objective is to build a focused, usable Android application.

## Consequences

The Version 1 architecture will target Reddit compatibility.

Future support for other platforms may require refactoring if it becomes a real requirement.

---

# ADR-009: Primary Navigation Model

**Status:** Proposed  
**Date:** 30 June 2026

## Context

Antenna requires a simple navigation model that supports browsing, discovery, local favourites, and settings without clutter.

## Decision

Antenna shall use five primary navigation destinations:

```text
Home
Search
Explore
My Subs
Settings
```

Settings shall contain secondary sections:

```text
Appearance
Content
Privacy
Account
FAQ
About
```

## Rationale

This structure cleanly separates common user tasks:

- Home for the user's local feed.
- Search for direct lookup.
- Explore for discovery.
- My Subs for local favourites.
- Settings for configuration and information.

## Consequences

The project must consistently explain that My Subs are local favourites, not Reddit account subscriptions.

---

# ADR-010: Modular Android Architecture Direction

**Status:** Proposed  
**Date:** 30 June 2026

## Context

Antenna needs a maintainable architecture that supports clear separation of UI, application logic, data access, network access, local storage, and platform services.

## Decision

Antenna should use a modular Android architecture with a small set of core and feature modules.

Initial module direction:

```text
app
core-ui
core-model
core-data
core-network
core-database
feature-home
feature-search
feature-explore
feature-my-subs
feature-settings
feature-post-detail
```

## Rationale

This structure keeps feature ownership clear while avoiding a generic multi-platform plugin architecture.

## Consequences

The module structure may be simplified if it proves too heavy during implementation.

Modules must exist because they solve a real separation problem, not because modularity looks professional.

---

# ADR-011: Local NSFW Visibility Setting

**Status:** Proposed  
**Date:** 30 June 2026

## Context

Antenna needs to handle NSFW-labelled content transparently and responsibly.

## Decision

Antenna shall include a local NSFW visibility setting under:

```text
Settings > Content > NSFW visibility
```

NSFW content shall be hidden or restricted by default. Users must confirm they are over 18 before enabling visibility.

The setting must not be presented as a way to bypass platform restrictions.

## Rationale

This supports user control while respecting platform limitations and user safety.

## Consequences

The setting must be applied consistently across Home, Search, Explore, community feeds, post detail screens, and media views where supported.

---

# ADR-012: Dependency Minimalism

**Status:** Proposed  
**Date:** 30 June 2026

## Context

Android applications can accumulate dependency bloat quickly, affecting application size, privacy, security, maintenance, and build reliability.

## Decision

Dependencies shall be added deliberately and only when they provide clear value.

Before adding a dependency, contributors should ask:

- Does Android already provide this capability?
- Is the dependency actively maintained?
- Does it introduce privacy concerns?
- Does it increase app size significantly?
- Does it make the code easier or harder to understand?
- Is it necessary for Version 1?

## Rationale

This supports simplicity, efficiency, privacy, and maintainability.

## Consequences

Dependency choices should be reviewed during pull requests and documented where significant.

---

# ADR-013: Initial Android Skeleton Baseline

**Status:** Accepted
**Date:** 30 June 2026

## Context

Antenna needs to move from documentation-only planning into an Android implementation while keeping the first technical step small and reversible.

The project still has several larger decisions open, including local storage, networking, media loading, and dependency injection. Those decisions are not required to establish the first launchable application shell.

## Decision

The initial implementation baseline shall use:

- A single `app` module.
- Kotlin.
- Jetpack Compose.
- Gradle Kotlin DSL.
- Application ID `dev.spoonzy4kn.antenna`.
- Minimum SDK 26.
- Compile SDK 35.
- Target SDK 35.
- JDK 17 language target.
- Primary navigation destinations: Home, Search, Explore, My Subs, and Settings.

The larger proposed module structure remains an architecture direction, not a requirement for the first scaffold.

## Rationale

Starting with one Android application module keeps the project easy to import, build, and change while the product foundation is still forming.

Compose matches the accepted native Android direction and supports the UI/UX specification without requiring XML screen layouts.

The chosen application ID avoids Reddit branding and gives the project a stable package namespace.

## Consequences

The first implementation step does not yet include local storage, network access, real feed data, or production settings.

Future work may split code into core and feature modules once there is enough real behaviour to justify the added structure.
