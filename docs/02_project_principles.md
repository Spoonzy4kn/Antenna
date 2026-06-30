# Project Principles

**Project:** Antenna  
**Status:** Accepted  
**Version:** 0.1  
**Last Updated:** 30 June 2026

## Purpose

These principles define how Antenna will be designed, implemented, documented, reviewed, and maintained. Every product, engineering, UI, dependency, privacy, and release decision should be evaluated against them.

The principles are intentionally practical. They should guide trade-offs during implementation rather than exist as slogans.

---

## P-001: Simple

Software should be easy to understand and easy to use.

Antenna should prefer direct user flows, clear data structures, clear module boundaries, and plain language. Complexity should only be introduced when it provides clear, measurable, and user-relevant value.

### Practical application

A feature, dependency, abstraction, or UI element should be reconsidered if it:

- Solves a problem that Version 1 does not have.
- Requires disproportionate explanation.
- Creates indirect navigation for a common task.
- Adds maintenance burden without clear benefit.
- Exists primarily because another application has it.

### Decision test

When two options achieve the same objective, choose the simpler option unless there is a documented reason not to.

---

## P-002: Efficient

Antenna should make effective use of system resources.

Development should prioritise:

- Fast startup.
- Efficient memory usage.
- Low battery consumption.
- Minimal network overhead.
- Intelligent caching where useful.
- Lightweight architecture.
- Avoidance of unnecessary background work.

### Practical application

Efficiency should influence feed loading, image loading, comment rendering, caching, scrolling, dependency selection, and data storage.

### Decision test

A proposed implementation should be reconsidered if it increases CPU, memory, battery, network usage, or app size without clear user benefit.

---

## P-003: Responsive

The user interface should provide immediate feedback and remain smooth under normal operating conditions.

Users should spend their time interacting with content rather than waiting for the application.

### Practical application

Antenna should provide clear loading states, preserve scroll position where practical, avoid blocking the main thread, and prevent large comment threads or media previews from making the UI unresponsive.

### Decision test

A flow is not complete if it works functionally but feels slow, unstable, or unpredictable during normal use.

---

## P-004: Practical

Every feature should solve a genuine problem.

The project values usefulness over feature count. A smaller feature set that is stable, clear, and reliable is preferable to a broad feature set that is fragile or inconsistent.

### Practical application

Version 1 should emphasise core browsing: Home, Search, Explore, My Subs, Settings, post detail, and comments.

### Decision test

A feature should be reconsidered if its main justification is novelty, technical interest, or parity with another product rather than a real user need.

---

## P-005: Intuitive

The interface should behave in ways users naturally expect.

Navigation should minimise unnecessary interactions. Labels should be consistent. Empty states should guide users without being intrusive. Settings should be discoverable without being overexposed.

### Practical application

Antenna should clearly distinguish:

- Home as the user's local feed.
- Search as direct lookup.
- Explore as discovery.
- My Subs as local favourites.
- Settings as secondary configuration and information.

### Decision test

A screen or control should be reconsidered if a typical user cannot infer its purpose without explanation.

---

## P-006: Transparent

Users should understand what the application is doing.

Antenna should clearly communicate:

- What data it stores.
- What permissions it requests.
- What features require platform access.
- What features require an account.
- What limitations are imposed by Reddit or another connected platform.
- Whether advertising, telemetry, or analytics are used.

### Practical application

Privacy information should be available in Settings. Account-required actions should be clearly separated from anonymous functionality. NSFW behaviour should be explained plainly and must not imply that local settings can bypass platform restrictions.

### Decision test

A feature should be reconsidered if it depends on hidden behaviour, unclear data handling, or vague permission justification.

---

## P-007: Maintainable

The project should be engineered for long-term sustainability.

Code should be:

- Readable.
- Modular.
- Documented.
- Testable.
- Easy to extend where extension is justified.
- Easy to refactor where future requirements change.

Documentation should evolve alongside the codebase.

### Practical application

UI screens should not perform network or database operations directly. Repositories should hide data source details. Platform-specific network behaviour should be isolated where practical. Dependencies should be added deliberately.

### Decision test

A change should be reconsidered if it makes the application harder to reason about, harder to test, or harder to modify.

---

## P-008: Consistent

The same problem should be solved the same way throughout the application.

Consistency in terminology, UI states, navigation patterns, error handling, and architecture improves usability and reduces maintenance effort.

### Practical application

Antenna should use consistent:

- Loading states.
- Empty states.
- Error messages.
- Restricted content messaging.
- Sort labels.
- Community naming conventions.
- Feature module structure.
- Requirement language.

### Decision test

A design or implementation should be reconsidered if it introduces a special case without a documented need.

---

## Guiding review questions

When making engineering or product decisions, ask:

- Does this make the application simpler?
- Does it improve efficiency?
- Does it make the application feel more responsive?
- Does it solve a real user problem?
- Will users understand it without explanation?
- Does it increase transparency?
- Does it protect privacy?
- Does it support long-term maintainability?
- Will it still make sense in five years?

If the answer is predominantly **no**, the feature or implementation should be reconsidered, deferred, or removed.

---

## Principle conflict resolution

Sometimes principles conflict. For example, a feature may improve privacy but add complexity, or a performance optimisation may make code harder to understand.

When principles conflict:

1. Prefer user safety and privacy first.
2. Prefer correctness and reliability over speed of implementation.
3. Prefer simple implementation unless the trade-off is documented.
4. Record significant trade-offs in the decision log.
5. Revisit trade-offs after implementation evidence exists.

---

## Project motto

**Simple. Efficient. Responsive. Practical. Intuitive.**
