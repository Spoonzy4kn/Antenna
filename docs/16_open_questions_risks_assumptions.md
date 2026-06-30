# Open Questions, Risks, and Assumptions

**Project:** Antenna  
**Status:** Active  
**Version:** 0.1  
**Last Updated:** 30 June 2026

---

## 1. Purpose

This document records open questions, assumptions, and risks that should be resolved or monitored during implementation.

---

## 2. Open questions

| ID | Question | Area | Status |
| --- | --- | --- | --- |
| OQ-001 | Which Reddit-compatible access method will Version 1 use? | Platform | Open |
| OQ-002 | What minimum Android SDK will be supported? | Android | Open |
| OQ-003 | Which local storage solution will store favourites and settings? | Architecture | Open |
| OQ-004 | Which networking library will be used? | Architecture | Open |
| OQ-005 | Which media/image loading library will be used? | Architecture | Open |
| OQ-006 | Will the project use dependency injection in Version 1? | Architecture | Open |
| OQ-007 | Will the initial implementation use all proposed modules or start smaller? | Architecture | Open |
| OQ-008 | Should Explore ship in Version 1 or after core browsing? | Product | Open |
| OQ-009 | Should Search include user search in Version 1? | Product | Open |
| OQ-010 | Should search history be stored locally? | Privacy | Open |
| OQ-011 | Should recently viewed communities be stored locally? | Privacy | Open |
| OQ-012 | Which licence will the project use? | Governance | Open |
| OQ-013 | What package/application ID will be used? | Release | Open |
| OQ-014 | Will CI be added before the first buildable Android skeleton? | Release | Open |

---

## 3. Assumptions

| ID | Assumption | Risk if false |
| --- | --- | --- |
| A-001 | Version 1 remains Android only. | Scope and architecture expand significantly. |
| A-002 | Kotlin and Jetpack Compose remain the preferred stack. | Architecture and UI docs need revision. |
| A-003 | Anonymous browsing remains useful enough for Version 1. | Account support may become necessary earlier. |
| A-004 | Reddit compatibility remains the sole Version 1 platform target. | Multi-provider complexity increases. |
| A-005 | No advertising, telemetry, or analytics remain default policy. | Privacy docs, settings, and trust model change. |

---

## 4. Risk register

| ID | Risk | Likelihood | Impact | Mitigation |
| --- | --- | --- | --- | --- |
| R-001 | Platform access restrictions reduce available features. | Medium | High | Keep features conditional and user messaging clear. |
| R-002 | Scope expands before foundation is built. | High | High | Use scope and decision log to reject non-essential work. |
| R-003 | Module structure becomes too heavy early. | Medium | Medium | Start smaller if needed and preserve boundaries. |
| R-004 | UI becomes cluttered. | Medium | Medium | Maintain five primary sections and clear settings hierarchy. |
| R-005 | Privacy posture weakens over time. | Low | High | Require privacy review and opt-in policy. |
| R-006 | Licence remains undecided. | Medium | Medium | Decide before encouraging external contribution. |
| R-007 | Tests are deferred too long. | Medium | Medium | Add unit tests for core logic early. |

---

## 5. Closure process

When a question is answered:

1. Update this document.
2. Update affected scope, requirements, architecture, UX, or privacy docs.
3. Record a decision in the decision log if significant.
4. Create implementation tasks where required.

---

## 6. Summary

Open questions are expected in pre-alpha. They should remain visible and be closed deliberately as implementation begins.
