# Decision Log

**Project:** Antenna  
**Status:** Draft  
**Version:** 0.1  
**Last Updated:** 30 June 2026  

---

## 1. Purpose

This document records significant product, architecture, and project decisions for Antenna.

The purpose of the decision log is to preserve the reasoning behind important choices so that future contributors can understand not only what was decided, but why it was decided.

This document is not intended to record every conversation or minor change. It should record decisions that affect project scope, architecture, implementation, user experience, privacy, compatibility, or maintainability.

---

## 2. Decision Record Format

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

---

## 3. Decision Register

| ID | Title | Status | Date |
|----|-------|--------|------|
| ADR-001 | Project Name | Accepted | 30 June 2026 |
| ADR-002 | Native Android Application | Accepted | 30 June 2026 |
| ADR-003 | Version 1 Compatibility Target | Accepted | 30 June 2026 |
| ADR-004 | Local Favourites | Accepted | 30 June 2026 |
| ADR-005 | No Advertising Within Application | Accepted | 30 June 2026 |
| ADR-006 | Privacy-First Default Position | Accepted | 30 June 2026 |
| ADR-007 | Documentation-First Project Setup | Accepted | 30 June 2026 |
| ADR-008 | Avoid Over-Engineering Version 1 | Accepted | 30 June 2026 |

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

The project should not unnecessarily describe itself as being permanently tied to a single provider. However, Version 1 needs a clear compatibility target to avoid excessive complexity.

## Decision

Antenna Version 1 shall target compatibility with Reddit.

The project documentation may describe the application more generally as a client for community-driven discussion platforms, while clearly stating that Version 1 is initially compatible with Reddit.

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

If diagnostics or telemetry are ever considered, they must be explicitly documented, justified, and opt-in.

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